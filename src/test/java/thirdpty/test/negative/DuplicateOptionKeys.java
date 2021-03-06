package thirdpty.test.negative;

import com.github.ryenus.rop.OptionParser.Command;
import com.github.ryenus.rop.OptionParser.Option;

@Command(descriptions = "A bad command with duplicated opt keys", name = "")
public class DuplicateOptionKeys {
	@Option(opt = "-k", description = "A field using option key '-k'")
	boolean opt1;
	@Option(opt = "-k", description = "Another field using option key '-k' again")
	boolean opt2;
}
