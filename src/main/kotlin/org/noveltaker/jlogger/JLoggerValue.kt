package org.noveltaker.jlogger

interface JLoggerValue {

    val Any.FULL_NAME: String
        get() {
            val tag = this.javaClass.simpleName
            val className = if (tag.length <= 23) tag else tag.substring(0, 23)
            val packageName = this.javaClass.packageName
            return "$packageName.$className"
        }
}


