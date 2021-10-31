/*
 * ao-payments-all - Convenience POM to include the payment processing API and all providers.
 * Copyright (C) 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-payments-all.
 *
 * ao-payments-all is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-payments-all is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-payments-all.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.aoapps.payments.all {
	// Direct
	requires transitive com.aoapps.payments.api; // <groupId>com.aoapps</groupId><artifactId>ao-payments-api</artifactId>
	requires transitive com.aoapps.payments.authorizeNet; // <groupId>com.aoapps</groupId><artifactId>ao-payments-authorizeNet</artifactId>
	requires transitive com.aoapps.payments.payflowPro; // <groupId>com.aoapps</groupId><artifactId>ao-payments-payflowPro</artifactId>
	requires transitive com.aoapps.payments.stripe; // <groupId>com.aoapps</groupId><artifactId>ao-payments-stripe</artifactId>
	requires transitive com.aoapps.payments.test; // <groupId>com.aoapps</groupId><artifactId>ao-payments-test</artifactId>
	requires transitive com.aoapps.payments.usaepay; // <groupId>com.aoapps</groupId><artifactId>ao-payments-usaepay</artifactId>
}
