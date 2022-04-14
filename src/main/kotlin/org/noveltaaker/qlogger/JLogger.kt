package org.noveltaaker.qlogger

import org.slf4j.Logger
import org.slf4j.LoggerFactory

interface JLogger {
    val logger: Logger
        get() = LoggerFactory.getLogger(this.javaClass.packageName)
}
