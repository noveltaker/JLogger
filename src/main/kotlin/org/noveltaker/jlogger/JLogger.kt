package org.noveltaker.jlogger

import org.slf4j.Logger
import org.slf4j.LoggerFactory

interface JLogger {
    val logger: Logger
        get() = LoggerFactory.getLogger(FULL_NAME)

    private val Any.FULL_NAME: String
        get() {
            val tag = this.javaClass.simpleName
            val className = if (tag.length <= 23) tag else tag.substring(0, 23)
            val packageName = this.javaClass.packageName
            return "$packageName.$className"
        }
}
