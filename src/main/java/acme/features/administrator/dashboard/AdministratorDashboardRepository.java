
package acme.features.administrator.dashboard;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorDashboardRepository extends AbstractRepository {

	@Query("select count(*) from Investorsrecords a")
	Integer countInvestorsRecords();

	@Query("select count(*) from Announcement a")
	Integer countAnnouncement();

	@Query("select count(*) from Companyrecord a")
	Integer countCompanyRecord();

	/*
	 * @Query("select min(a.reward.amount) from Request a")
	 * Money getMinRewardRequest();
	 *
	 * @Query("select max(a.reward.amount) from Request a")
	 * Money getMaxRewardRequest();
	 *
	 * @Query("select min(a.reward.amount) from Offers a")
	 * Money getMinRewardOffer();
	 *
	 * @Query("select max(a.reward.amount) from Offers a")
	 * Money getMaxRewardOffer();
	 */

}
