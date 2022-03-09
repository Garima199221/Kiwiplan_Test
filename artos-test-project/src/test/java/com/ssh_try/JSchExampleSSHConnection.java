package com.ssh_try;

import java.io.OutputStream;
import java.io.PrintStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;


public class JSchExampleSSHConnection {

	/**
	 * JSch Example Tutorial
	 * Java SSH Connection Program
	 */
	public static void main(String[] args) {
	    String host="NZSR8GARIMAB";
	    String user="java00";
	    String password="mapadm99";
	 //   String command1="pwd; ls -al;base";
	    try{
	    	
	    	java.util.Properties config = new java.util.Properties(); 
	    	config.put("StrictHostKeyChecking", "no");
	    	JSch jsch = new JSch();
	    	Session session=jsch.getSession(user, host, 22);
	    	session.setPassword(password);
	    	session.setConfig(config);
	    	session.connect();
	    	System.out.println("Connected");
	    	
			
			
			
			  Channel channel = session.openChannel("shell");
			  
			  OutputStream inputstream_for_the_channel = channel.getOutputStream();
			  PrintStream commander = new PrintStream(inputstream_for_the_channel, true);
			  
			  channel.setOutputStream(System.out, true);
			  
			  channel.connect();
			  
			  commander.println("ls -la"); commander.println("cd folder");
			  commander.println("base"); commander.println("restmap amcart");
			  commander.println("mysql -u kiwisql -pmapadm99 java00 -e \"drop table RESCAL\"");
			  commander.println("mysql -u kiwisql -pmapadm99 java00 -e \"update master set available='N' where tname = 'RESCAL'\"");
			  commander.println("pcs00"); commander.println("exit"); commander.close();
			  
			  do { Thread.sleep(1000); } while(!channel.isEOF());
			  
			  session.disconnect();
			 
			 
		    
			
			
				
			/*
			 * Channel channel=session.openChannel("exec");
			 * 
			 * ((ChannelExec)channel).setCommand(command1); channel.setInputStream(null);
			 * ((ChannelExec)channel).setErrStream(System.err);
			 * 
			 * 
			 * InputStream in=channel.getInputStream(); channel.connect(); byte[] tmp=new
			 * byte[1024]; while(true){ while(in.available()>0){ int i=in.read(tmp, 0,
			 * 1024); if(i<0)break; System.out.print(new String(tmp, 0, i)); }
			 * if(channel.isClosed()){
			 * System.out.println("exit-status: "+channel.getExitStatus()); break; }
			 * try{Thread.sleep(1000);}catch(Exception ee){} } channel.disconnect();
			 * session.disconnect();
			 * 
			 */
	        System.out.println("DONE");
	     
	        
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    
	   
	}

}