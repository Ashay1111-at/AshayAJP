import java.awt.*;
import java.awt.event.*;

public class Practical4 {
    public static void main(String[] args) {
        Frame f = new Frame("Two Level Card Deck");

        CardLayout mainCardLayout = new CardLayout();
        f.setLayout(mainCardLayout);

        Panel firstCard = new Panel();
        firstCard.setLayout(new FlowLayout());
        firstCard.add(new Label("First Card"));
        Button toSecondCard = new Button("Go to Second Card");
        firstCard.add(toSecondCard);

        Panel secondCard = new Panel(new CardLayout());
        Panel subCard1 = new Panel();
        subCard1.add(new Label("Sub Card 1"));
        Panel subCard2 = new Panel();
        subCard2.add(new Label("Sub Card 2"));

        secondCard.add(subCard1, "Sub Card 1");
        secondCard.add(subCard2, "Sub Card 2");

        Button showSubCard1 = new Button("Show Sub Card 1");
        Button showSubCard2 = new Button("Show Sub Card 2");

        showSubCard1.addActionListener(e -> ((CardLayout) secondCard.getLayout()).show(secondCard, "Sub Card 1"));
        showSubCard2.addActionListener(e -> ((CardLayout) secondCard.getLayout()).show(secondCard, "Sub Card 2"));

        Panel buttonPanel = new Panel();
        buttonPanel.add(showSubCard1);
        buttonPanel.add(showSubCard2);

        Panel secondCardContainer = new Panel(new BorderLayout());
        secondCardContainer.add(secondCard, BorderLayout.CENTER);
        secondCardContainer.add(buttonPanel, BorderLayout.SOUTH);

        f.add(firstCard, "First Card");
        f.add(secondCardContainer, "Second Card");

        toSecondCard.addActionListener(e -> mainCardLayout.show(f, "Second Card"));

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setSize(300, 200);
        f.setVisible(true);

        mainCardLayout.show(f, "First Card");
    }
}
