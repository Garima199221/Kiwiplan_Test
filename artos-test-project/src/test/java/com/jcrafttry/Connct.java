package com.jcrafttry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.pastdev.jsch.DefaultSessionFactory;
import com.pastdev.jsch.command.CommandRunner;

public class Connct {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		DefaultSessionFactory sessionFactory = new DefaultSessionFactory(
                "java00", "NZSR8GARIMAB", 22
        );
        Map props = new HashMap<String, String>();
        props.put("StrictHostKeyChecking", "no");
        sessionFactory.setConfig(props);
        sessionFactory.setPassword("mapadm99");

        CommandRunner runner = new CommandRunner(sessionFactory);

        String command = "ls -al";
        CommandRunner.ExecuteResult result = runner.execute(command);

        if (result.getStderr().isEmpty()) {
            System.out.println(result.getStdout());
        } else {
            System.out.println(result.getStderr());
            System.out.println("hello");
        }

        runner.close();
    }	
	}


