package io.kalipo.prototype.application;

import io.kalipo.prototype.data.NftRepository;
import io.kalipo.prototype.domain.Nft;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NftService {

    private NftRepository nftRepository;

    public Nft create(String data) {
        this.nftRepository.save(new Nft(data));
        return this.nftRepository.findTopByOrderByIdDesc();
    }

    public Nft read(Long id) {
        return this.nftRepository.findById(id).orElseThrow();
    }
}
