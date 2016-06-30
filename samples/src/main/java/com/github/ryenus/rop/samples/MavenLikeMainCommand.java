package com.github.ryenus.rop.samples;

import com.github.ryenus.rop.OptionParser;
import com.github.ryenus.rop.annotations.Command;
import com.github.ryenus.rop.annotations.Option;

@Command(name = "mvn", descriptions = "Maven is a build automation tool used primarily for Java projects")
public class MavenLikeMainCommand { // this is the parent Command

	@Option(opt = { "-o", "--offline" }, description = "Work offline")
	boolean offline;

	public static void main(String[] args) {
		OptionParser parser = 
		  new OptionParser(
		    // first Command is the parent (level-1 Command)
			MavenLikeMainCommand.class, 
			// all others are level-2 sub-commands
			MavenCleanCommand.class, 
			MavenTestCommand.class
	      ); 
		
		parser.parse(args, true); // with the additional boolean argument, multiple sub-commands can run together
	}
}

@Command(name = "clean", descriptions = "cleans up artifacts created by prior builds")
class MavenCleanCommand {
	// There's no option here

	void run() {
		// Simply perform the cleanup
		System.out.println("***   running clean   ***");
	}
}

@Command(name = "test", descriptions = "test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed")
class MavenTestCommand {
	void run(OptionParser parser) {
		
		System.out.println("***   running tests   ***");
		
		MavenLikeMainCommand mavenMainCommand = parser.get(MavenLikeMainCommand.class);
		if (mavenMainCommand.offline) {
			// work offline, no network connection
			System.out.println("***   running tests: offline option   ***");
		}
		// do the test
	}
}
