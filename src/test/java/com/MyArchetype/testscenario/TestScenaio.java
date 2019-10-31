package com.MyArchetype.testscenario;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.MyArchetype.testscript.TestScript;

public class TestScenaio  {
TestScript script=new TestScript();

@Parameters({"browserType"})
@Test
public void setBrowser(String browserType) throws IOException {
	script.openBrowser(browserType);
}
}
