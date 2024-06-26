/**
 * generated by Xtext 2.34.0
 */
package org.xtext.project.tdsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(TDslInjectorProvider.class)
@SuppressWarnings("all")
public class TDslCodeGenTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;

  @Test
  public void testDSLCodeCompilesToExpectedOutput() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("->On clap do:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- play sound sound1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("If front middle horizontal sensor detecting proximity:");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("- drive backward");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("End if");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("# variables for notes");
      _builder_1.newLine();
      _builder_1.append("var notes[6]");
      _builder_1.newLine();
      _builder_1.append("var durations[6]");
      _builder_1.newLine();
      _builder_1.append("var note_index = 6");
      _builder_1.newLine();
      _builder_1.append("var note_count = 6");
      _builder_1.newLine();
      _builder_1.append("var wave[142]");
      _builder_1.newLine();
      _builder_1.append("var i");
      _builder_1.newLine();
      _builder_1.append("var wave_phase");
      _builder_1.newLine();
      _builder_1.append("var wave_intensity");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("# compute a sinus wave for sound");
      _builder_1.newLine();
      _builder_1.append("for i in 0:141 do");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("wave_phase = (i-70)*468");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("call math.cos(wave_intensity, wave_phase)");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("wave[i] = wave_intensity/256");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.append("call sound.wave(wave)");
      _builder_1.newLine();
      _builder_1.append("# reset outputs ");
      _builder_1.newLine();
      _builder_1.append("call sound.system(-1)");
      _builder_1.newLine();
      _builder_1.append("call leds.top(0,0,0)");
      _builder_1.newLine();
      _builder_1.append("call leds.bottom.left(0,0,0)");
      _builder_1.newLine();
      _builder_1.append("call leds.bottom.right(0,0,0)");
      _builder_1.newLine();
      _builder_1.append("call leds.circle(0,0,0,0,0,0,0,0)");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("# when a note is finished, play the next note");
      _builder_1.newLine();
      _builder_1.append("onevent sound.finished ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("if note_index != note_count then");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("call sound.freq(notes[note_index], durations[note_index])");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("note_index += 1");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("# setup threshold for detecting claps");
      _builder_1.newLine();
      _builder_1.append("mic.threshold = 250");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("onevent mic");
      _builder_1.newLine();
      _builder_1.append("        \t");
      _builder_1.append("call math.copy(notes[0:5], [524, 440, 370, 311, 440, 262]) ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("call math.copy(durations[0:5], [7, 7, 7, 7, 7, 7]) ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("note_index = 1 ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("note_count = 6 ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("call sound.freq(notes[0], durations[0])");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("if prox.horizontal[2] >= 2000 then");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("motor.left.target = -500");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("motor.right.target = -500");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testDSLCodeCompilesToExpectedOutpu2t() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("-> On tap do:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("If right ground sensor detecting black :");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- set top color to red");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("End if");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("If right ground sensor detecting white :");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- set top color to green");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("End if");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("If front middle horizontal sensor detecting no proximity:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- drive forward");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- play sound sound1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- set top color to pink");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- set bottom color to yellow");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("End if");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("If front middle horizontal sensor detecting no proximity:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- turn left");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- play sound sound3");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- turn off top leds");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- turn off bottom leds");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("End if");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.newLine();
      _builder_1.append("# reset outputs ");
      _builder_1.newLine();
      _builder_1.append("call sound.system(-1)");
      _builder_1.newLine();
      _builder_1.append("call leds.top(0,0,0)");
      _builder_1.newLine();
      _builder_1.append("call leds.bottom.left(0,0,0)");
      _builder_1.newLine();
      _builder_1.append("call leds.bottom.right(0,0,0)");
      _builder_1.newLine();
      _builder_1.append("call leds.circle(0,0,0,0,0,0,0,0)");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("onevent tap");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("if prox.ground.delta[1] < 400 then");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("call leds.top(32,0,0)        ");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("if prox.ground.delta[1] > 450 then");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("call leds.top(0,32,0)        ");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("if prox.horizontal[2] <= 1000 then");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("motor.left.target = 500");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("motor.right.target = 500");
      _builder_1.newLine();
      _builder_1.append("    \t");
      _builder_1.append("call math.copy(notes[0:5], [524, 440, 370, 311, 440, 262]) ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("call math.copy(durations[0:5], [7, 7, 7, 7, 7, 7]) ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("note_index = 1 ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("note_count = 6 ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("call sound.freq(notes[0], durations[0])");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("call leds.top(32,0,32)        ");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("call leds.bottom.left(32,32,0)");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("call leds.bottom.right(32,32,0)        ");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("if prox.horizontal[2] <= 1000 then");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("motor.left.target = -500");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("motor.right.target = 500");
      _builder_1.newLine();
      _builder_1.append("    \t");
      _builder_1.append("call math.copy(notes[0:5], [311, 440, 370, 0, 440, 311]) ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("call math.copy(durations[0:5], [7, 14, 7, 14, 7, 14]) ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("note_index = 1 ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("note_count = 6 ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("call sound.freq(notes[0], durations[0])");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testDSLCodeCompilesToExpectedOutput3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("->On right ground sensor detecting white do: ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- drive forward");
      _builder.newLine();
      _builder.append("->On left ground sensor detecting white do:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- drive forward with speed 300");
      _builder.newLine();
      _builder.append("-> On right ground sensor detecting black do:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- turn left");
      _builder.newLine();
      _builder.append("-> On left ground sensor detecting black do:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- turn right");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("# reset outputs ");
      _builder_1.newLine();
      _builder_1.append("call sound.system(-1)");
      _builder_1.newLine();
      _builder_1.append("call leds.top(0,0,0)");
      _builder_1.newLine();
      _builder_1.append("call leds.bottom.left(0,0,0)");
      _builder_1.newLine();
      _builder_1.append("call leds.bottom.right(0,0,0)");
      _builder_1.newLine();
      _builder_1.append("call leds.circle(0,0,0,0,0,0,0,0)");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("onevent prox");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("when prox.ground.delta[1] > 450 do");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("motor.left.target = 500");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("motor.right.target = 500");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("when prox.ground.delta[0] > 450 do");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("motor.left.target = 300");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("motor.right.target = 300");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("when prox.ground.delta[1] < 400 do");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("motor.left.target = -500");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("motor.right.target = 500");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("when prox.ground.delta[0] < 400 do");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("motor.left.target = 500");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("motor.right.target = -500");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
