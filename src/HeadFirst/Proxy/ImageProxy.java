package HeadFirst.Proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author NikoBelic
 * @create 9/20/16 21:21
 */
public class ImageProxy implements Icon
{
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url)
    {
        imageURL = url;
    }

    public int getIconWidth()
    {
        if (imageIcon != null)
            return imageIcon.getIconWidth();
        else
            return 800;
    }

    public int getIconHeight()
    {
        if (imageIcon != null)
            return imageIcon.getIconHeight();
        else
            return 600;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        if (imageIcon != null)
            imageIcon.paintIcon(c,g,x,y);
        else
        {
            g.drawString("Loading CD cover,please wait....",x+300,y+190);
            if (!retrieving)
            {
                retrieving = true;
                retrievalThread = new Thread(new Runnable()
                {
                    @Override
                    public void run() {
                        imageIcon = new ImageIcon(imageURL,"CD Cover");
                        c.repaint();
                    }
                });
                retrievalThread.start();
            }
        }
    }
}
