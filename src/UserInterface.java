import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;

//imagine JFrame class was there
//inherit
public class UserInterface extends JFrame {
//constructor
    public UserInterface(){
        super("Weather App");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //size of GUI
        setSize(450,650);
        //center GUI
        setLocationRelativeTo(null);
        //makes it possible for us to set width and height as we want
        setLayout(null);
        //prevent resize
        setResizable(false);

        addGUIComponents();
    }

    public void addGUIComponents(){
        //GUI components that will be visible on the screen
        //search bar
        JTextField searchBar = new JTextField();

        //set where the component will be located
        searchBar.setBounds(15,15,351,45);

        //change font
        searchBar.setFont(new Font("Dialog", Font.PLAIN, 24));

        //add searchBar so that its visible
        add(searchBar);

        //search button
        JButton searchButton = new JButton(loadImage("assets/search.png"));

        //cursor pointer

        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //set where the component will be located

        searchButton.setBounds(375, 13, 47, 45);

        //add search button
        add(searchButton);

    }

    //use this to load images for the GUI components
    private ImageIcon loadImage(String resourcePath){

        try {
            //read image from path given
            BufferedImage image = ImageIO.read(new File(resourcePath));

            //return image icon to be rendered
            return new ImageIcon(image);
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Could not find the resource mentioned.");
        return null;
    }
}
