package ec.com.se;

import ec.com.se.business.Hit;
import org.junit.Assert;

/**
 * Created by pazfernando on 1/29/16.
 */
public class HitTest {
    public void shouldReturnFivePoints() {
        Hit hit = new Hit();
        Assert.assertEquals("Player push puch", 5, hit.pushPunch());
    }
}
