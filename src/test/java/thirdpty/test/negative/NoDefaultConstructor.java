package thirdpty.test.negative;

import com.github.ryenus.rop.annotations.Command;
import com.github.ryenus.rop.annotations.Option;

@Command(name = "con", descriptions = "")
public class NoDefaultConstructor {

	@Option(description = "", opt = { "-b", "--boolean" })
	boolean b;

	private NoDefaultConstructor(boolean bool) {
	}
}
