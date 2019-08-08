package com.cg.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;

public class UserNameAlreadyExistsException extends Exception {

	@Override
	public String getMessage() {
		return "UserName already exists. Please try again with different username.";
	}
	@Override
	public String getLocalizedMessage() {
		return super.getLocalizedMessage();
	}
	@Override
	public synchronized Throwable getCause() {
		return super.getCause();
	}
	@Override
	public synchronized Throwable initCause(Throwable cause) {
		return super.initCause(cause);
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}
	@Override
	public void printStackTrace(PrintStream s) {
		super.printStackTrace(s);
	}
	@Override
	public void printStackTrace(PrintWriter s) {
		super.printStackTrace(s);
	}
	@Override
	public synchronized Throwable fillInStackTrace() {
		return super.fillInStackTrace();
	}
	@Override
	public StackTraceElement[] getStackTrace() {
		return super.getStackTrace();
	}
	@Override
	public void setStackTrace(StackTraceElement[] stackTrace) {
		super.setStackTrace(stackTrace);
	}
}
