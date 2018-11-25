/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.myDsl.Automate;
import org.xtext.example.mydsl.myDsl.Contains;
import org.xtext.example.mydsl.myDsl.Fonction;
import org.xtext.example.mydsl.myDsl.Foreach;
import org.xtext.example.mydsl.myDsl.Instruction;
import org.xtext.example.mydsl.myDsl.Program;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Tab;
import org.xtext.example.mydsl.myDsl.Verify;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile(
      "Main.java", 
      this.generateAutomate(IterableExtensions.<Automate>head(Iterables.<Automate>filter(resource.getContents(), Automate.class))));
  }
  
  public CharSequence generateAutomate(final Automate automate) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import org.xtext.example.mydsl.*;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import java.util.Map;\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import org.openqa.selenium.*;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import org.openqa.selenium.firefox.FirefoxDriver;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import org.openqa.selenium.remote.DesiredCapabilities;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public class Main {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Map<String, Object> variables = new HashMap<String, Object>();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("boolean result = true;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("String cmd, obj;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    CharSequence _generateProgram = this.generateProgram(automate, automate.getProgram());
    _builder.append(_generateProgram, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateProgram(final Automate automate, final Program prog) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.setProperty(\"webdriver.gecko.driver\", \"./geckodriver\");");
    _builder.newLine();
    _builder.append("DesiredCapabilities capabilities = DesiredCapabilities.firefox();");
    _builder.newLine();
    _builder.append("capabilities.setCapability(\"marionette\", true);");
    _builder.newLine();
    _builder.append("WebDriver driver = new FirefoxDriver(capabilities);");
    _builder.newLine();
    _builder.append("JavascriptExecutor jse = ((JavascriptExecutor)driver);");
    _builder.newLine();
    _builder.append("driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);");
    _builder.newLine();
    {
      EList<Statement> _stats = prog.getStats();
      for(final Statement s : _stats) {
        CharSequence _generateStatement = this.generateStatement(s, prog.getStats().indexOf(s));
        _builder.append(_generateStatement);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateStatement(final Statement statement, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      if ((statement instanceof Instruction)) {
        _builder.append("\t\t");
        CharSequence _generateInstruction = this.generateInstruction(((Instruction) statement));
        _builder.append(_generateInstruction, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((statement instanceof Tab)) {
        _builder.append("\t\t");
        CharSequence _generateTab = this.generateTab(((Tab) statement));
        _builder.append(_generateTab, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((statement instanceof Fonction)) {
        _builder.append("\t\t");
        CharSequence _generateFonction = this.generateFonction(((Fonction) statement));
        _builder.append(_generateFonction, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((statement instanceof Verify)) {
        _builder.append("\t\t");
        CharSequence _generateVerify = this.generateVerify(((Verify) statement));
        _builder.append(_generateVerify, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((statement instanceof Foreach)) {
        _builder.append("\t\t");
        CharSequence _generateForeach = this.generateForeach(((Foreach) statement));
        _builder.append(_generateForeach, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateInstruction(final Instruction instruction) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _cmd = instruction.getCmd();
      boolean _tripleNotEquals = (_cmd != null);
      if (_tripleNotEquals) {
        _builder.append("cmd = \"");
        String _cmd_1 = instruction.getCmd();
        _builder.append(_cmd_1);
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("switch(cmd){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("case \"url\":");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("driver.get(\"");
        String _param = instruction.getParam();
        _builder.append(_param, "\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("case \"click\":");
        _builder.newLine();
        {
          String _obj = instruction.getObj();
          boolean _tripleNotEquals_1 = (_obj != null);
          if (_tripleNotEquals_1) {
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("obj = \"");
            String _obj_1 = instruction.getObj();
            _builder.append(_obj_1, "\t\t");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("switch(obj) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("case \"link\":");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("WebElement elem = driver.findElement(By.xpath(\"//a[contains(text(),\'");
            String _param_1 = instruction.getParam();
            _builder.append(_param_1, "\t\t\t\t");
            _builder.append("\')]\"));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("elem.click();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("break;\t");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("case \"check\":");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("case \"uncheck\":");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("case \"search\":");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("case \"choose\":");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCommande(final Instruction instruction, final String string) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateForeach(final Foreach foreach) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateVerify(final Verify verify) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.newLine();
    {
      Contains _contains = verify.getContains();
      boolean _tripleNotEquals = (_contains != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("String objet = \"");
        String _obj = verify.getContains().getObj();
        _builder.append(_obj, "\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("switch(objet){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("case \"link\":");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("WebElement elem = driver.findElement(By.xpath(\"//a[contains(text(),\'");
        String _value = verify.getContains().getValue();
        _builder.append(_value, "\t\t");
        _builder.append("\')]\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("boolean testContains = (elem != null );");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("System.out.println(testContains);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("case \"text\":");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("case \"button\":");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("case \"image\":");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("case \"all\":");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateFonction(final Fonction fonction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateTab(final Tab tab) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<String> list");
    String _name = tab.getV().getName();
    _builder.append(_name, "\t");
    _builder.append(" = new ArrayList<String>();");
    _builder.newLineIfNotEmpty();
    {
      EList<String> _values = tab.getValues();
      for(final String value : _values) {
        _builder.append("\t");
        _builder.append("liste");
        String _name_1 = tab.getV().getName();
        _builder.append(_name_1, "\t");
        _builder.append(".add(\"");
        _builder.append(value, "\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}