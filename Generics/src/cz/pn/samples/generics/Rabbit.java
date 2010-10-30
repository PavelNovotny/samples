package cz.pn.samples.generics;

/**
 * Created by IntelliJ IDEA.
 * User: Pavel
 * Date: 30.10.2010
 * Time: 22:04:41
 * To change this template use File | Settings | File Templates.
 */
public class Rabbit extends Animal {
    private boolean likesCarrot;

    public boolean isLikesCarrot() {
        return likesCarrot;
    }

    public void setLikesCarrot(boolean likesCarrot) {
        this.likesCarrot = likesCarrot;
    }
}
