package io.kalipo.prototype.application;

import io.kalipo.prototype.data.NftRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NftService {

    private NftRepository nftRepository;
}
