package thirdpty.test;

import com.github.ryenus.rop.annotations.Command;
import com.github.ryenus.rop.annotations.Option;

@Command(name = "passwd", descriptions = "test password input")
class PasswordInput {
	@Option(opt = "-p", secret = true, description = "safety check")
	char[] password;
}