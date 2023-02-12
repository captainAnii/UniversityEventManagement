package Controller;

import Model.Event;
import Repository.EventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventRepository eventRepository;

    @PostMapping
    public Event addEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    @PutMapping("/{eventId}")
    public Event updateEvent(@PathVariable Long eventId, @RequestBody Event event) {
        Event e = eventRepository.findById(eventId).get();
        e.setEventName(event.getEventName());
        e.setLocationOfEvent(event.getLocationOfEvent());
        e.setDate(event.getDate());
        e.setStartTime(event.getStartTime());
        e.setEndTime(event.getEndTime());
        return eventRepository.save(e);
    }

    @DeleteMapping("/{eventId}")
    public void deleteEvent(@PathVariable Long eventId) {
        eventRepository.deleteById(eventId);
    }

    @GetMapping("/{date}")
    public List<Event> getAllEventsByDate(@PathVariable String date) {
        return EventRepository.findByDate(date);
    }
}