package org.example.registrationservice.models.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.registrationservice.clients.EventClient;
import org.example.registrationservice.models.dto.responses.EventResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventGatewayService {
    private final EventClient eventClient;

    public EventResponse getEventById(Long eventId) {
        throw new UnsupportedOperationException();
    }
}
