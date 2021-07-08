package jp.co.soramitsu.iroha2.scale.reader.query;

import io.emeraldpay.polkaj.scale.ScaleCodecReader;
import io.emeraldpay.polkaj.scale.ScaleReader;
import jp.co.soramitsu.iroha2.model.query.FindAllDomains;

public class FindAllDomainsReader implements ScaleReader<FindAllDomains> {

  @Override
  public FindAllDomains read(ScaleCodecReader scaleCodecReader) {
    return new FindAllDomains();
  }
}