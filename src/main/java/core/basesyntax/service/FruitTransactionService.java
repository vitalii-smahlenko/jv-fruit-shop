package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface FruitTransactionService {
    void transaction(List<FruitTransaction> statistic);
}
