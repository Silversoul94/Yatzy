package se.Henrik;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Henrik on 2015-12-03.
 */
public  class MyActionListener implements ActionListener {
    int clickCount = 0;
    Yatzy yatzyscore = new Yatzy();

//    Layout layout = new Layout();
    public MyActionListener(){
        clickCount ++;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if(clickCount >=1){
          //  layout.one.setEnabled(false);



        }
    }
}
