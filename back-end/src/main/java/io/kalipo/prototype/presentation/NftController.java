package io.kalipo.prototype.presentation;

import io.kalipo.prototype.application.NftService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("nfts")
@AllArgsConstructor
public class NftController {

    private NftService nftService;
}
