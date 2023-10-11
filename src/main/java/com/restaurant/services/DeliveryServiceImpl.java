package com.restaurant.services;


import com.restaurant.persistence.entity.Delivery;
import com.restaurant.persistence.repository.DeliveryRepository;
import com.restaurant.services.interfaces.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class DeliveryServiceImpl implements DeliveryService {

    private final DeliveryRepository deliveryRepository;

    @Override
    public Delivery save(Delivery delivery) {
        if (delivery.getDuration() == null || delivery.getDuration() < 1 || delivery.getDuration() > 60) {
            throw new IllegalArgumentException("La duración debe estar en el rango de 1 a 60.");
        }

        return deliveryRepository.save(delivery);
    }
    @Override
    public List<Delivery> findAll() {
        return deliveryRepository.findAll();
    }


}
