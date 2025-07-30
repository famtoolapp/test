package com.safe.setting.app.di.module;

import com.safe.setting.app.services.sms.InteractorSms;
import com.safe.setting.app.services.sms.InterfaceInteractorSms;
import com.safe.setting.app.services.sms.InterfaceServiceSms;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.safe.setting.app.di.PerService")
@QualifierMetadata
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
public final class ServiceModule_ProvideInterfaceInteractorSmsFactory implements Factory<InterfaceInteractorSms<InterfaceServiceSms>> {
  private final ServiceModule module;

  private final Provider<InteractorSms<InterfaceServiceSms>> interactorProvider;

  public ServiceModule_ProvideInterfaceInteractorSmsFactory(ServiceModule module,
      Provider<InteractorSms<InterfaceServiceSms>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorSms<InterfaceServiceSms> get() {
    return provideInterfaceInteractorSms(module, interactorProvider.get());
  }

  public static ServiceModule_ProvideInterfaceInteractorSmsFactory create(ServiceModule module,
      Provider<InteractorSms<InterfaceServiceSms>> interactorProvider) {
    return new ServiceModule_ProvideInterfaceInteractorSmsFactory(module, interactorProvider);
  }

  public static InterfaceInteractorSms<InterfaceServiceSms> provideInterfaceInteractorSms(
      ServiceModule instance, InteractorSms<InterfaceServiceSms> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorSms(interactor));
  }
}
