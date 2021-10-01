package com.sampleCode
package mainCode

final case class DevideByZeroException(private val message: String = "",
                                 private val cause: Throwable = None.orNull)
  extends Exception(message, cause) 