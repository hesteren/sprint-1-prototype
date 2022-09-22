package io.kalipo.prototype.data;

import io.kalipo.prototype.domain.Nft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NftRepository extends JpaRepository<Nft, Long> {
    Nft findTopByOrderByIdDesc();
}
