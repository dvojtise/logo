/*
* generated by Xtext
*/
package example.logo.xtext_editor;

import example.logo.xtext_editor.LogoTextualSyntaxStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LogoTextualSyntaxStandaloneSetup extends LogoTextualSyntaxStandaloneSetupGenerated{

	public static void doSetup() {
		new LogoTextualSyntaxStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

