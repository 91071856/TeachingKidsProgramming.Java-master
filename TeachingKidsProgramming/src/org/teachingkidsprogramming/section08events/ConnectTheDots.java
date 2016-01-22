package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class ConnectTheDots implements MouseRightClickListener, MouseLeftClickListener
{
  public static void main(String[] args)
  {
    //    Create a new 'Connect The Dots' object. --#1.1
    new ConnectTheDots();
  }
  public ConnectTheDots()
  {
    Tortoise.show();
    //    Listen for right clicks on the window for the tortoise  --#20.2
    Tortoise.getBackgroundWindow().addMouseRightClickListener(this);
    //    Listen for left clicks on the window for the tortoise  --#1.2
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    //    Make the Tortoise go as fast as possible. --#4
    Tortoise.setSpeed(10);
    //    clearTheScreen (recipe below) --#19.1
    //
    //    ------------- Recipe for clearTheScreen --#19.2
    clearTheScreen();
    //    ------------- End of clearTheScreen Recipe --#19.3
    //
    //    prepareColorPalette (recipe below) --#17.1
    //    ------------- Recipe for prepareColorPalette --#17.2
    prepareColorPalette();
    //    ------------- End of prepareColorPalette Recipe --#17.3
  }
  private void clearTheScreen()
  {
    //       Clear the Tortoise --#20.1
    Tortoise.clear();
    //       Write "Right click to clear" on the screen at position 100, 100 --#18
    new Text("Right click to clear").setTopLeft(100, 100).addTo(Tortoise.getBackgroundWindow());
  }
  private void prepareColorPalette()
  {
    //       Add red to the color wheel --#6
    ColorWheel.addColor(PenColors.Reds.Red);
    //       Add green to the color wheel --#12
    ColorWheel.addColor(PenColors.Greens.Green);
    //       Add blue to the color wheel --#13
    ColorWheel.addColor(PenColors.Blues.Blue);
    //       Add purple to the color wheel --#14
    ColorWheel.addColor(PenColors.Purples.Purple);
    //       Add pink to the color wheel --#15
    ColorWheel.addColor(PenColors.Pinks.Pink);
    //       Add teal to the color wheel --#16
    ColorWheel.addColor(PenColors.Greens.Teal);
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
    //    clearTheScreen (recipe above) --#20.3
    clearTheScreen();
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //    addDot (recipe below) --#11.1
    //
    //    ------------- Recipe for addDot --#11.2
    addDot(x, y);
    //  ------------- End of addDot Recipe --#11.3
  }
  private void addDot(int x, int y)
  {
    //        addACircle (recipe below) --#10.1
    //
    //        ------------- Recipe for addACircle --#10.2
    addACircle(x, y);
    //        ------------- End of addACircle Recipe --#10.3
    //
    //    Move the tortoise to the current position of the mouse --#2
    Tortoise.moveTo(x, y);
  }
  private void addACircle(int x, int y)
  {
    //           Create a circle with a radius of 7 which is the same color as the next color on the color wheel --#5
    Circle circle = new Circle(7, ColorWheel.getNextColor());
    //           Change the circle to be 40% opaque --#9
    circle.setTransparency(60);
    //           Move the circle so that it's center is at the current position of the mouse --#8
    circle.setCenter(x, y);
    //           Place the circle on the tortoise's window. --#7
    circle.addTo(Tortoise.getBackgroundWindow());
  }
}
