package devos.jlsl;

import devos.jlsl.fragments.*;

@FunctionalInterface
public interface CodeFilter
{
	public CodeFragment filter(CodeFragment fragment);
}
