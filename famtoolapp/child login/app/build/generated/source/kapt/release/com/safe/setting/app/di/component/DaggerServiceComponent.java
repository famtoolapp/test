package com.safe.setting.app.di.component;

import android.content.Context;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.safe.setting.app.data.rxFirebase.InterfaceFirebase;
import com.safe.setting.app.di.module.ServiceModule;
import com.safe.setting.app.di.module.ServiceModule_ProvideContextFactory;
import com.safe.setting.app.di.module.ServiceModule_ProvideInterfaceInteractorSmsFactory;
import com.safe.setting.app.services.sms.InteractorSms;
import com.safe.setting.app.services.sms.InteractorSms_Factory;
import com.safe.setting.app.services.sms.InterfaceInteractorSms;
import com.safe.setting.app.services.sms.InterfaceServiceSms;
import com.safe.setting.app.services.sms.SmsService;
import com.safe.setting.app.services.sms.SmsService_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
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
public final class DaggerServiceComponent {
  private DaggerServiceComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ServiceModule serviceModule;

    private AppComponent appComponent;

    private Builder() {
    }

    public Builder serviceModule(ServiceModule serviceModule) {
      this.serviceModule = Preconditions.checkNotNull(serviceModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }

    public ServiceComponent build() {
      Preconditions.checkBuilderRequirement(serviceModule, ServiceModule.class);
      Preconditions.checkBuilderRequirement(appComponent, AppComponent.class);
      return new ServiceComponentImpl(serviceModule, appComponent);
    }
  }

  private static final class ServiceComponentImpl implements ServiceComponent {
    private final ServiceComponentImpl serviceComponentImpl = this;

    private Provider<Context> provideContextProvider;

    private Provider<InterfaceFirebase> getInterfaceFirebaseProvider;

    private Provider<InteractorSms<InterfaceServiceSms>> interactorSmsProvider;

    private Provider<InterfaceInteractorSms<InterfaceServiceSms>> provideInterfaceInteractorSmsProvider;

    private ServiceComponentImpl(ServiceModule serviceModuleParam, AppComponent appComponentParam) {

      initialize(serviceModuleParam, appComponentParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ServiceModule serviceModuleParam,
        final AppComponent appComponentParam) {
      this.provideContextProvider = ServiceModule_ProvideContextFactory.create(serviceModuleParam);
      this.getInterfaceFirebaseProvider = new GetInterfaceFirebaseProvider(appComponentParam);
      this.interactorSmsProvider = InteractorSms_Factory.create(provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorSmsProvider = DoubleCheck.provider(ServiceModule_ProvideInterfaceInteractorSmsFactory.create(serviceModuleParam, interactorSmsProvider));
    }

    @Override
    public void inject(SmsService smsService) {
      injectSmsService(smsService);
    }

    @CanIgnoreReturnValue
    private SmsService injectSmsService(SmsService instance) {
      SmsService_MembersInjector.injectInteractor(instance, provideInterfaceInteractorSmsProvider.get());
      return instance;
    }

    private static final class GetInterfaceFirebaseProvider implements Provider<InterfaceFirebase> {
      private final AppComponent appComponent;

      GetInterfaceFirebaseProvider(AppComponent appComponent) {
        this.appComponent = appComponent;
      }

      @Override
      public InterfaceFirebase get() {
        return Preconditions.checkNotNullFromComponent(appComponent.getInterfaceFirebase());
      }
    }
  }
}
