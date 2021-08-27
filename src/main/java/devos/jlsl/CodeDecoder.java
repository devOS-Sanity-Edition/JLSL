package devos.jlsl;

import java.util.List;

import devos.jlsl.fragments.*;

public abstract class CodeDecoder
{

	public JLSLContext context = null;

	public abstract void handleClass(Object data, List<CodeFragment> out);
}
