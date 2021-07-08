package jp.co.soramitsu.iroha2.scale.reader.query;

import io.emeraldpay.polkaj.scale.ScaleCodecReader;
import io.emeraldpay.polkaj.scale.ScaleReader;
import jp.co.soramitsu.iroha2.model.query.FindAccountsByName;
import jp.co.soramitsu.iroha2.scale.reader.ExpressionReader;

public class FindAccountsByNameReader implements ScaleReader<FindAccountsByName> {

  private static final ExpressionReader EXPRESSION_READER = new ExpressionReader();

  @Override
  public FindAccountsByName read(ScaleCodecReader reader) {
    return new FindAccountsByName(reader.read(EXPRESSION_READER));
  }
}