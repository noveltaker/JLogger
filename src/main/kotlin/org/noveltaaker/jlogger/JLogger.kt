package org.noveltaaker.jlogger

import org.slf4j.Logger
import org.slf4j.LoggerFactory

interface JLogger : JLoggerValue {
    val logger: Logger
        get() = LoggerFactory.getLogger(FULL_NAME)
}
