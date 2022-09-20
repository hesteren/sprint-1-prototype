package io.kalipo.prototype.presentation;

import io.kalipo.prototype.application.NftService;
import io.kalipo.prototype.domain.Nft;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("nfts")
@AllArgsConstructor
public class NftController {

    private NftService nftService;

    @PostMapping
    public ResponseEntity<Nft> create(@RequestBody NftDto nftDto) {
        return ResponseEntity.ok(this.nftService.create(nftDto.data));
    }
}

@Data
class NftDto {
    String data;
}
