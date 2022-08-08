package com.zachtib.delightful

import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.required

interface ProgramArguments {

    val inputFile: String

    val outputFile: String?
}

private class ProgramArgumentsParser : ArgParser("delightful"), ProgramArguments {
    override val inputFile by option(
        type = ArgType.String,
        shortName = "i",
        description = "Input file",
    ).required()

    override val outputFile by option(
        type = ArgType.String,
        shortName = "o",
        description = "Output file name",
    )

}

fun parseArguments(args: Array<String>): ProgramArguments {
    return ProgramArgumentsParser().apply { parse(args) }
}