/*
 * Copyright (c) 2019 Owain van Brakel <https://github.com/Owain94>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

object ProjectVersions {
    const val runeliteVersion = "1.10.31.2"
    const val apiVersion = "^1.0.0"
}

object Libraries {
    private object Versions {
        const val annotations = "24.1.0"
        const val apacheCommonsText = "1.12.0"
        const val gson = "2.11.0"
        const val guice = "4.2.3"
        const val junit = "5.10.2"
        const val lombok = "1.18.32"
        const val mockito = "5.2.0"
        const val okhttp3 = "4.12.0"
        const val pf4j = "3.11.0"
        const val rxjava = "3.1.8"
        const val findbugs = "3.0.2"
        const val slf4j = "2.0.13"
    }

    const val annotations = "org.jetbrains:annotations:${Versions.annotations}"
    const val apacheCommonsText = "org.apache.commons:commons-text:${Versions.apacheCommonsText}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val guice = "com.google.inject:guice:${Versions.guice}"
    const val guiceTestlib = "com.google.inject.extensions:guice-testlib:${Versions.guice}"
    const val junit = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
    const val lombok = "org.projectlombok:lombok:${Versions.lombok}"
    const val mockitoCore = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockitoInline = "org.mockito:mockito-inline:${Versions.mockito}"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3}"
    const val pf4j = "org.pf4j:pf4j:${Versions.pf4j}"
    const val rxjava = "io.reactivex.rxjava3:rxjava:${Versions.rxjava}"
    const val findbugs = "com.google.code.findbugs:jsr305:${Versions.findbugs}"
    const val slf4jApi = "org.slf4j:slf4j-api:${Versions.slf4j}"

}