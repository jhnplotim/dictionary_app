package io.github.jhnplotim.mydictionary.feature_dictionary.data.remote.dto

data class PhoneticDto(
    val audio: String,
    val license: LicenseDto,
    val sourceUrl: String,
    val text: String
)