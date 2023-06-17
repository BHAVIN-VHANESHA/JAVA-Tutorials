import java.applet.*;

/*
<applet code="MyApplet" width=200 height=60>
</applet>
*/

public class MyApplet extends Applet {
    public void init(){
        //applet is being loaded
    }
    public void start(){
        //execution starts from here
    }
    public void stop(){
        //stop execution
    }
    public void destroy() {
        //applet that it is being reclaimed and that it should destroy
    }
}