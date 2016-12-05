package se.Henrik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Created by Henrik on 2015-11-09.
 */
public class Layout extends JFrame implements ActionListener {
   int clickCount = 0;
   int diceButtonClickCount =3;
    String[] data = {"1","2","3","4","5","6","Sum","Bonus","Pair","Two Pair","Three kind","Four kind",
    "Fullhouse","LowStraight","HighStraight","Chans","Yatzy","Totalsum"};
    JList<String> Ylist = new JList(data);

    JPanel mainPanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JPanel dicePanel  = new JPanel();
    JPanel middelPanel = new JPanel();
    JPanel tabelPanel  = new JPanel();
    JPanel buttonPanel = new JPanel();

    JLabel text = new JLabel("Dice show");

    Yatzy yatzy = new Yatzy();
    JLabel diceImage1 = new JLabel();
    JLabel diceImage2 = new JLabel();
    JLabel diceImage3 = new JLabel();
    JLabel diceImage4 = new JLabel();
    JLabel diceImage5 = new JLabel();
    JButton rollDiceButton = new JButton("Roll dice");
    JLabel diceRollCounter = new JLabel("3");

    JCheckBox dicehold1 = new JCheckBox("hold dice 1");
    JCheckBox dicehold2 = new JCheckBox("hold dice 2");
    JCheckBox dicehold3 = new JCheckBox("hold dice 3");
    JCheckBox dicehold4 = new JCheckBox("hold dice 4");
    JCheckBox dicehold5 = new JCheckBox("hold dice 5");

    JButton one = new JButton("one");
    JButton two = new JButton("two");
    JButton three = new JButton ("three");
    JButton four = new JButton ("Four");
    JButton five = new JButton ("Five");
    JButton six = new JButton ("Six");

    JLabel Sum = new JLabel("sum");
    JLabel bonus = new JLabel("False");

    JButton pair = new JButton ("Pair");
    JButton twoPair = new JButton ("Two Pair");
    JButton threekind = new JButton ("Three Kind");
    JButton fourkind = new JButton ("Four kind");
    JButton fullhouse = new JButton ("Fullhouse");
    JButton low = new JButton("Low");
    JButton high = new JButton("High");
    JButton Chans = new JButton ("Chans");
    JButton yatzybutton = new JButton ("Yatzy");
    JLabel totalsum = new JLabel("totalsum");

    ArrayList <Dice> diceList;

    public Layout(){
        CreateAndShowGui();
        diceList = yatzy.getDiceList();
    }
    public  void CreateAndShowGui(){
        add(mainPanel);
        mainPanel.add(topPanel);
        mainPanel.add(bottomPanel);

         topPanel.setLayout(new BoxLayout( topPanel, BoxLayout.Y_AXIS));

         topPanel.add(dicePanel);
         topPanel.add(middelPanel);
        // top Panel
        dicePanel.add(text);

        diceImage1.setIcon(new ImageIcon("D:\\Java\\Yatzy\\DicePic\\Dice1.png"));
        diceImage2.setIcon(new ImageIcon("D:\\Java\\Yatzy\\DicePic\\Dice1.png"));
        diceImage3.setIcon(new ImageIcon("D:\\Java\\Yatzy\\DicePic\\Dice1.png"));
        diceImage4.setIcon(new ImageIcon("D:\\Java\\Yatzy\\DicePic\\Dice1.png"));
        diceImage5.setIcon(new ImageIcon("D:\\Java\\Yatzy\\DicePic\\Dice1.png"));

        dicePanel.add(diceImage1);
        dicePanel.add(diceImage2);
        dicePanel.add(diceImage3);
        dicePanel.add(diceImage4);
        dicePanel.add(diceImage5);

        dicePanel.add(rollDiceButton);
        rollDiceButton.addActionListener(this);
        dicePanel.add(diceRollCounter);

        dicePanel.add(dicehold1);
        //slut på top Panel
        //middel Panel
        middelPanel.add(dicehold1);
        middelPanel.add(dicehold2);
        middelPanel.add(dicehold3);
        middelPanel.add(dicehold4);
        middelPanel.add(dicehold5);
        // slut på middel panel

        // tabelPanel
        bottomPanel.setLayout(new BorderLayout(5,6));
        bottomPanel.add(tabelPanel,BorderLayout.LINE_START);
        tabelPanel.add(Ylist);
        Ylist.setFont(Ylist.getFont().deriveFont(16.5f));

        bottomPanel.add(buttonPanel,BorderLayout.CENTER);
        buttonPanel.setLayout(new BoxLayout( buttonPanel, BoxLayout.Y_AXIS));


        /**
         * så att knappen för antal ettor funkar
         */
        buttonPanel.add(one);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    one.setEnabled(false);
                    yatzy.ponitsForOne();
                    one.setText(String.valueOf(yatzy.oneholder));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    bonus.setText(String.valueOf(yatzy.bonuschecker()));
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }
            }
        });
        buttonPanel.add(two);
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    two.setEnabled(false);
                    yatzy.ponitsForTwo();
                    two.setText(String.valueOf(yatzy.twoholder));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    bonus.setText(String.valueOf(yatzy.bonuschecker()));
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }
            }
        });
        buttonPanel.add(three);
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    three.setEnabled(false);
                    yatzy.ponitsForThree();
                    three.setText(String.valueOf(yatzy.threeholder));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    bonus.setText(String.valueOf(yatzy.bonuschecker()));
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }

            }
        });
        buttonPanel.add(four);
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    four.setEnabled(false);
                    yatzy.ponitsForFour();
                    four.setText(String.valueOf(yatzy.fourholder));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    bonus.setText(String.valueOf(yatzy.bonuschecker()));
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }

            }
        });
        buttonPanel.add(five);
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    five.setEnabled(false);
                    yatzy.ponitsForFive();
                    five.setText(String.valueOf(yatzy.fiveholder));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    bonus.setText(String.valueOf(yatzy.bonuschecker()));
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }
            }
        });
        buttonPanel.add(six);
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    six.setEnabled(false);
                    yatzy.ponitsForSix();
                    six.setText(String.valueOf(yatzy.sixholder));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    bonus.setText(String.valueOf(yatzy.bonuschecker()));
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }

            }
        });

        buttonPanel.add(Sum);
        buttonPanel.add(bonus);

        buttonPanel.add(pair);
        pair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    pair.setEnabled(false);
                    yatzy.pair();
                    pair.setText(String.valueOf(yatzy.pairscore));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }
            }
        });
        buttonPanel.add(twoPair);
        twoPair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    twoPair.setEnabled(false);
                    yatzy.checkTwopairs();
                    twoPair.setText(String.valueOf(yatzy.twoPairs));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }
            }
        });
        buttonPanel.add(threekind);
        threekind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    threekind.setEnabled(false);
                    yatzy.threeOfKind();
                    threekind.setText(String.valueOf(yatzy.threekindscore));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }
            }
        });
        buttonPanel.add(fourkind);
        fourkind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    fourkind.setEnabled(false);
                    yatzy.fourOfKind();
                    fourkind.setText(String.valueOf(yatzy.fourkindscore));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }
            }
        });
        buttonPanel.add(fullhouse);
        fullhouse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    fullhouse.setEnabled(false);
                    yatzy.checkFullhouse();
                    fullhouse.setText(String.valueOf(yatzy.fullhousescore));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }
            }
        });
        buttonPanel.add(low);
        low.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    low.setEnabled(false);
                    yatzy.lowstraight();
                    low.setText(String.valueOf(yatzy.lowscore));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }
            }
        });
        buttonPanel.add(high);
        high.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    high.setEnabled(false);
                    yatzy.Highstraight();
                    high.setText(String.valueOf(yatzy.highscore));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }

            }
        });
        buttonPanel.add(Chans);
        Chans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    Chans.setEnabled(false);
                    yatzy.chans();
                    Chans.setText(String.valueOf(yatzy.dicesum));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);
                }
            }
        });
        buttonPanel.add(yatzybutton);
        yatzybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if (clickCount >= 1) {
                    yatzybutton.setEnabled(false);
                    yatzy.yatzyChecker();
                    yatzybutton.setText(String.valueOf(yatzy.yatzyscore));
                    Sum.setText(String.valueOf(yatzy.getTotalScoreOfNumber()));
                    totalsum.setText(String.valueOf(yatzy.getTotalScoreSum()));
                    diceButtonClickCount = 3;
                    diceRollCounter.setText(String.valueOf(diceButtonClickCount));
                    rollDiceButton.setEnabled(true);
                    dicehold1.setSelected(false);
                    dicehold2.setSelected(false);
                    dicehold3.setSelected(false);
                    dicehold4.setSelected(false);
                    dicehold5.setSelected(false);

                }
            }
        });
        buttonPanel.add(totalsum);
        //slut på tabelPanel

        pack();
        setSize(950,700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
        public void actionPerformed(ActionEvent e) {
        diceButtonClickCount--;
        diceRollCounter.setText(String.valueOf(diceButtonClickCount));
            if ( diceButtonClickCount == 0) {
                rollDiceButton.setEnabled(false);
            }
            if (!dicehold1.isSelected()) {
                diceList.get(0).roll();
                diceImage1.setIcon(new ImageIcon("D:\\Java\\Yatzy\\DicePic\\Dice" + diceList.get(0).getValue() + ".png"));
            }

            if (!dicehold2.isSelected()) {
                diceList.get(1).roll();
                diceImage2.setIcon(new ImageIcon("D:\\Java\\Yatzy\\DicePic\\Dice" + diceList.get(1).getValue() + ".png"));

            }
            if (!dicehold3.isSelected()) {
                diceList.get(2).roll();
                diceImage3.setIcon(new ImageIcon("D:\\Java\\Yatzy\\DicePic\\Dice" + diceList.get(2).getValue() + ".png"));
            }
            if (!dicehold4.isSelected()) {
                diceList.get(3).roll();
                diceImage4.setIcon(new ImageIcon("D:\\Java\\Yatzy\\DicePic\\Dice" + diceList.get(3).getValue() + ".png"));
            }
            if (!dicehold5.isSelected()) {
                diceList.get(4).roll();
                diceImage5.setIcon(new ImageIcon("D:\\Java\\Yatzy\\DicePic\\Dice" +  diceList.get(4).getValue() + ".png"));
            }
    }
}