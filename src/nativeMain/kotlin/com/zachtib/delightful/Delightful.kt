package com.zachtib.delightful

import com.zachtib.delightful.dd2vtt.DungeonDraftVTT
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.okio.encodeToBufferedSink
import okio.*
import okio.Path.Companion.toPath


@OptIn(ExperimentalSerializationApi::class)
fun delightful(args: ProgramArguments) {

    val original = args.openInputFile().use { source ->
        Json.decodeFromString<DungeonDraftVTT>(source.buffer().readUtf8())
    }

    val delighted = original.copy(lights = emptyList())

    args.openOutputFile().use { sink ->
        Json.encodeToBufferedSink(delighted, sink.buffer())
    }
    println("Done: ${args.getOutputFilename()}")
}

fun ProgramArguments.openInputFile(): Source {
    val path = inputFile.toPath()
    return FileSystem.SYSTEM.source(path)
}

fun ProgramArguments.openOutputFile(): Sink {
    val path = getOutputFilename().toPath()
    return FileSystem.SYSTEM.sink(path)
}

fun ProgramArguments.getOutputFilename(): String {
    return outputFile ?: inputFile.insertBeforeExtension("_delighted")
}

fun String.insertBeforeExtension(substring: String): String {
    val index = lastIndexOf('.')
    val nameWithoutExtension = substring(0, index)
    val extension = substring(index)

    return "$nameWithoutExtension$substring$extension"
}