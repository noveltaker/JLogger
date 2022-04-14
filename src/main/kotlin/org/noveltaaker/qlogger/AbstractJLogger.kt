package org.noveltaaker.qlogger

import org.slf4j.LoggerFactory

abstract class AbstractJLogger {
    val logger = LoggerFactory.getLogger(this.javaClass.packageName)
}
