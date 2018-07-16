package sudarshan.bhatt.diwithdagger2.mvpWithStaticData;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Handler;

public class GetQuoteInteractorImpl implements GetQuoteInteractor {

    private List<String> arrayList = Arrays.asList(
            "Be yourself. everyone else is already taken.",
            "A room without books is like a body without a soul.",
            "You only live once, but if you do it right, once is enough.",
            "Be the change that you wish to see in the world.",
            "If you tell the truth, you don't have to remember anything."
    );


    @Override
    public void getNextQuotes(final OnFinishedListener onFinishedListener) {

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onFinishedListener.onFinished(getRandomQuote());
            }
        }, 2000);
    }


    private String getRandomQuote() {

        try {
            Random random = new Random();
            return arrayList.get(random.nextInt(arrayList.size()));
        } catch (Exception e) {
            return arrayList.get(0);
        }


    }
}
