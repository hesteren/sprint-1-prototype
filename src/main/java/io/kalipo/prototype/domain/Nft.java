package io.kalipo.prototype.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "NFTS")
public class Nft {

    @Id
    @GeneratedValue
    private Long id;

    // represents data
    private String data;

    protected Nft() {}

    public Nft(String data) {
        this.data = getAlphaNumericString(data.length());
    }

    // function to generate a random string of length n
    private String getAlphaNumericString(int n)
    {

        // chose a Character random from this String
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(alphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(alphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
}
