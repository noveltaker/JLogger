package org.noveltaaker.jlogger

import org.slf4j.LoggerFactory

abstract class AbstractJLogger : JLoggerValue {
    val logger = LoggerFactory.getLogger(FULL_NAME)
}
