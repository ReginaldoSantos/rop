package thirdpty.test.negative;

import com.github.ryenus.rop.annotations.Command;
import com.github.ryenus.rop.annotations.Option;

@Command(name = "foo", descriptions = "")
public class OptionNoKey {
	@Option(opt = {}, description = "")
	boolean verbose;
}