package com.processBuil;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcTry {

	public static void main(String[] args) throws IOException, AWTException, Exception {
	 ProcessBuilder processBuilder = new ProcessBuilder();

	        // Run this on Windows, cmd, /c = terminate after this run
	      
	processBuilder.command("putty.exe","NZSR8GARIMAB");
	    // processBuilder.command("bash","pwd");
processBuilder.command("C:\\Users\\garima.bhatia\\Documents//First.bat");
//processBuilder.command("cmd.exe","/c","dir C:\\Users\\garima.bhatia\\Documents");
	     
	  try { Process process = processBuilder.start(); //This will block other tasks
	  BufferedReader reader = new BufferedReader(new
	  InputStreamReader(process.getInputStream())); String line; while ((line =
	  reader.readLine()) != null) { System.out.println(line); } int exitCode =
	  process.waitFor(); System.out.println("\nExited with error code : " +
	  exitCode);
	  
	  } catch (Exception e) { e.printStackTrace(); } } }
	 