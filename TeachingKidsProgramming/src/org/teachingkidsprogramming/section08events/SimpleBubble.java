package org.teachingkidsprogramming.section08events;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble implements MouseLeftClickListener
{
  private ProgramWindow programWindow;
  public SimpleBubble()
  {
    programWindow = new ProgramWindow("My Bubble");
    //    Uncomment the line below -- #1.2
    programWindow.setWindowVisible(true);
    //    Have SimpleBubble listen for when the left mouse button is clicked in your program window --#2.2
    programWindow.addMouseLeftClickListener(this);
    //    prepareColorPalette (recipe below) --#7.1
    //
    //    ------------- Recipe for prepareColorPalette --#7.2
    prepareColorPalette();
    //    ------------- End of prepareColorPalette recipe --#7.3
  }
  private void prepareColorPalette()
  {
    //         Add purple to the color wheel --#2.3
    ColorWheel.addColor(PenColors.Purples.Purple);
    //         Add light steel blue to the color wheel --#4
    ColorWheel.addColor(PenColors.Blues.LightSteelBlue);
    //         Add blue to the color wheel --#5
    ColorWheel.addColor(PenColors.Blues.Blue);
    //         Add dark blue to the color wheel --#6
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //     createBubble (recipe below) --#8.1
    //     ------------- Recipe for createBubble --#8.2
    createBubble(x, y);
    //    ------------- End of createBubble recipe --#8.3
  }
  private void createBubble(int x, int y)
  {
    //     Remove previous bubbles from your program window --#9
    programWindow.removePaintable();
    //     Set the radius for the circle to a random number between 10 and 50 --#2.5
    int radius = NumberUtils.getRandomInt(10, 50);
    //     Create a circle with the radius and the next color from the color wheel --#2.1
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    //     Move the center of the bubble to the current position of the mouse on the window --#3
    circle.setCenter(x, y);
    //     Add the circle to your program window --#2.4
    circle.addTo(programWindow);
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}