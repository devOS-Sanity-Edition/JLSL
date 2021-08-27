package devos.jlsl;

import java.io.*;

import devos.jlsl.glsl.*;
import devos.jlsl.java.*;

public class NewTest
{

	public static void main(String[] args)
	{
		BytecodeDecoder decoder = new BytecodeDecoder();// .addInstructionsFromInterfaces(true);
		// GLSLEncoder encoder = new GLSLEncoder(120);
		JavaEncoder encoder = new JavaEncoder(120);
		JLSLContext context = new JLSLContext(decoder, encoder);
		// context.addFilters(new ObfuscationFilter());
		context.execute(TestShader.class, new PrintWriter(System.out));
	}

}
