package java.com.kafka.event;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Outgoing;

import io.reactivex.Flowable;

@ApplicationScoped
public class EventOutgoing {

	private Random random = new Random();

	@Outgoing("newEvent")
	public Flowable<Double> generate() {
		return Flowable.interval(5, TimeUnit.SECONDS).map(tick -> random.nextDouble());
	}

}